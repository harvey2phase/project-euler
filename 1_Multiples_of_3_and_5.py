# Created December, 2017

a, b, c, s = 3, 5, 15, 0
while a < 1000:
    s += a
    a += 3
while b < 1000:
    s += b
    b += 5
while c < 1000:
    s -= c
    c += 15
print(s)
