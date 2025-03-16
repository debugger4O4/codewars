# https://www.codewars.com/kata/538835ae443aae6e03000547/train/python

from typing import Callable

def add(n):
    def result(i):
        return n + i
    return result