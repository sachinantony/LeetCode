class Solution:
    def isToeplitzMatrix(self, matrix):
        groupDict = {}
        print(len(matrix[0]))
        rLength = len(matrix)
        cLength = len(matrix[0])
        for i in range(0,rLength):
            for j in range(0,cLength):
                if i-j not in groupDict:
                    groupDict[i-j] = matrix[i][j]
                elif groupDict[i-j] != matrix[i][j]:
                    return False
        
        return True