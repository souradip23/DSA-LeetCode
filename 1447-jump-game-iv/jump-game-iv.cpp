class Solution {
public:
    int minJumps(vector<int>& arr) {
         unordered_map<int, vector<int>> valueToIndices;
        int arraySize = arr.size();
      
        // Populate the map with value -> list of indices
        for (int i = 0; i < arraySize; ++i) {
            valueToIndices[arr[i]].push_back(i);
        }
      
        // Track visited indices to avoid revisiting
        vector<bool> visited(arraySize);
      
        // BFS queue starting from index 0
        queue<int> bfsQueue{{0}};
        visited[0] = true;
      
        // BFS level by level to find minimum jumps
        for (int steps = 0;; ++steps) {
            // Process all nodes at current level
            int currentLevelSize = bfsQueue.size();
            for (int k = 0; k < currentLevelSize; ++k) {
                int currentIndex = bfsQueue.front();
                bfsQueue.pop();
              
                // Check if we've reached the last index
                if (currentIndex == arraySize - 1) {
                    return steps;
                }
              
                // Jump to all indices with the same value
                for (int nextIndex : valueToIndices[arr[currentIndex]]) {
                    if (!visited[nextIndex]) {
                        visited[nextIndex] = true;
                        bfsQueue.push(nextIndex);
                    }
                }
              
                // Clear the value group to avoid redundant checks in future iterations
                valueToIndices[arr[currentIndex]].clear();
              
                // Jump to adjacent indices (left and right)
                vector<int> adjacentIndices = {currentIndex - 1, currentIndex + 1};
                for (int nextIndex : adjacentIndices) {
                    if (nextIndex >= 0 && nextIndex < arraySize && !visited[nextIndex]) {
                        visited[nextIndex] = true;
                        bfsQueue.push(nextIndex);
                    }
                }
            }
        }
    }
};