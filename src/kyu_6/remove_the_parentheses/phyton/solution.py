# https://www.codewars.com/kata/5f7c38eb54307c002a2b8cc8/train/python

import re

def remove_parentheses(sentence):
    while re.findall(r"\([^()]*\)", sentence):
        sentence = re.sub(r"\([^()]*\)", "", sentence)
    return sentence