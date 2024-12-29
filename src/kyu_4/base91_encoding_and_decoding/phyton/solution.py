import pip
pip.main(['install', 'base91'])
import base91

b91decode = lambda s: base91.decode(s).decode()
b91encode = lambda s: base91.encode(s.encode())