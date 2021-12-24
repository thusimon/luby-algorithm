from TreeNode import TreeNode

class BST:
  def __init__(self):
    self.root = None

  def insert(self, val):
    if self.root == None:
      self.root = TreeNode(val)
      return self
    else:
      newNode = TreeNode(val)
      curNode = self.root
      while True:
        if val < curNode.val:
          if curNode.left == None:
            curNode.left = newNode
            return self
          else:
            curNode = curNode.left
        else:
          if curNode.right == None:
            curNode.right = newNode
            return self
          else:
            curNode = curNode.right

  def find(self, val):
    if self.root == None:
      return None
    curNode = self.root
    while curNode != None:
      if curNode.val == val:
        return curNode
      elif curNode.val < val:
        curNode = curNode.right
      else:
        curNode = curNode.left
    return None

  def display(self, node):
    if node != None:
      self.display(node.left)
      print(node.val)
      self.display(node.right)

  def minSubTree(node):
    curNode = node
    while curNode.left != None:
      curNode = curNode.left
    return curNode
    
  def remove(self, node, val):
    if node == None:
      return None
    if node.val < val:
      node.right = self.remove(node.right, val)
    elif node.val > val:
      node.left = self.remove(node.left, val)
    else:
      if node.left == None:
        temp = node.right
        node = None
        return temp
      elif node.right == None:
        temp = node.left
        node = None
        return temp
      else:
        #both left right exists
        minNodeInRight = self.minSubTree(node.right)
        node.val = minNodeInRight.val
        node.right = self.remove(node.right, minNodeInRight.val)
    return node

bst = BST()
bst.insert(20)
bst.insert(10)
bst.insert(5)
bst.insert(15)
bst.insert(30)
bst.display(bst.root)
bst.remove(bst.root, 30)
bst.display(bst.root)
