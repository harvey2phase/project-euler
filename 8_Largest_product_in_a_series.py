import numpy as np

string = np.loadtxt('8_Largest_product_in_a_series_input.txt',
    dtype = str)
num = []
for i in string:
    for j in i:
        num.append(int(j))

step = 4
num = np.array(num)
pro = 1
for i in range (step):
    pro *= num[i]

large = pro
for i in range(1, len(num) - step):
    bot = num[i]
    top = num[i+step]
    if top == 0:
        pro = 1


    pro = (pro / bot) * top
    if large < pro:
        large = pro

print(large)
