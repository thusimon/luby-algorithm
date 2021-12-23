class Node:
  def __init__(self, val):
    self.val = val
    self.next = None
    
class LinkedList:
  def __init__(self, val):
    self.head = Node(val)
    self.tail = self.head
    self.len = 1

  def print(self):
    curNode = self.head
    res = []
    while curNode is not None:
      res.append(curNode.val)
      curNode = curNode.next
    print(res)

  def append(self, val):
    newNode = Node(val)
    self.tail.next = newNode
    self.tail = newNode
    self.len += 1
    return self

  def prepend(self, val):
    newNode = Node(val)
    newNode.next = self.head
    self.head = newNode
    self.len += 1
    return self

  def at(self, idx):
    if idx <= 0:
      return self.head
    if idx >= self.len - 1:
      return self.tail
    count = 0
    curNode = self.head
    while count < idx:
      curNode = curNode.next
      count += 1
    return curNode

  def insert(self, idx, val):
    if idx <= 0:
      self.prepend(val)
      return self
    if idx >= self.len:
      self.append(val)
      return self
    leadNode = self.at(idx - 1)
    newNode = Node(val)
    newNode.next = leadNode.next
    leadNode.next = newNode
    self.len += 1
    return self

  def remove(self, idx):
    if idx <= 0:
      # remove head
      self.head = self.head.next
      self.len -= 1
      return self
    if idx >= self.len - 1:
      # remove tail
      leadNode = self.at(self.len - 2)
      leadNode.next = None
      self.tail = leadNode
      self.len -= 1
      return self
    leadNode = self.at(idx - 1)
    curNode = leadNode.next
    leadNode.next = curNode.next
    self.len -= 1
    return self
  
  def reverse(self):
    if self.len <= 1:
      return self
    node1 = self.head
    self.tail = self.head
    node2 = node1.next
    while node2 != None:
      temp = node2.next
      node2.next = node1
      node1 = node2
      node2 = temp
    self.head = node1
    self.tail.next = None
    return self

list1 = LinkedList(10)
list1.append(15).append(18).prepend(99).insert(0, 29).insert(3, 44).insert(5, 12).insert(8, 77)
# 29 99 10 44 15 12 18 77
list1.print()
list1.remove(1).remove(5)
# 29 10 44 15 12 77
list1.print()
list1.reverse()
list1.print()
