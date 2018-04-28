# Created December 2018

import numpy as np

grid = np.loadtxt('11_grid.txt')
m = 0
for i in range(17):
    for j in range(17):
        p = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3]
        if m < p:
            m = p
        p = grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3]
        if m < p:
            m = p

        p = grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j]
for i in range(3, 20):
    for j in range(17):
        p = grid[i][j]*grid[i-1][j+1]*grid[i-2][j+2]*grid[i-3][j+3]
        if m < p:
            m = p

print(m)
