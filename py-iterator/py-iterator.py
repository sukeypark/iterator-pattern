from abc import ABC, abstractmethod


class MenuItem:
    def __init__(self, *, name: str, description: str, price: float):
        self.name = name
        self.description = description
        self.price = price
        self._right = self._left = None

    def __str__(self) -> str:
        return f"name: {self.name}\ndescription: {self.description}\nprice: {round(self.price, 2)}\n{'-' * 20}"

    @property
    def left(self) -> "MenuItem":
        return self._left

    @property
    def right(self) -> "MenuItem":
        return self._right

    @left.setter
    def left(self, left: "MenuItem") -> None:
        self._left = left

    @right.setter
    def right(self, right: "MenuItem") -> None:
        self._right = right


class MenuItemTree(ABC):
    def __init__(self):
        self.root = self.tail = None

    def add_item(self, item: MenuItem):
        if not self.root:
            self.root = item
            self.tail = item
            return

        node = self.root
        while node != self.tail:
            if item.price < node.price:
                if not node.left:
                    node.left = item
                    break
                else:
                    node = node.left
            else:
                if not node.right:
                    node.right = item
                    break
                else:
                    node = node.right
        self.tail = item

    @abstractmethod
    def __iter__(self):
        pass

    @abstractmethod
    def __next__(self):
        pass


class InorderMenuItemTree(MenuItemTree):
    def __iter__(self):
        self._g = self.traverse(self.root)
        return self._g

    def __next__(self):
        return next(self._g)

    def traverse(self, node: MenuItem):
        if not node:
            return
        yield from self.traverse(node.left)
        yield node
        yield from self.traverse(node.right)


"""
    Inorder iterator: 가격 낮은 순
"""

if __name__ == "__main__":
    import random

    tree = InorderMenuItemTree()
    for i in range(8):
        tree.add_item(
            MenuItem(
                name=f"menu{i}", description=f"menu{i}", price=random.uniform(0, 10)
            )
        )

    for item in tree:
        print(item)
