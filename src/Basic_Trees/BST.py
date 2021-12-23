from TreeNode import TreeNode

class BST:
  def __init__(self):
    self.root = None
    return self
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
  def remove(self, val):
    if self.root == None:
      return None
    
    pass