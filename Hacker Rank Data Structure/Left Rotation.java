
vector<int> rotateLeft(int d, vector<int> arr) {
        int num = arr[0];
        vector<int> arr2(arr.size());
        int i = 0;
        for(int j=d; j<arr.size();j++)
        {
            arr2[i++]=arr[j];
        }
        for(int j=0;j<d;j++)
        {
            arr2[i++]=arr[j];
        }
    return arr2;
}