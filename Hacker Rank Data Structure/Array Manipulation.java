long arrayManipulation(int n, vector<vector<int>> queries) {
    vector<long> arr(n,0);
    long max=LLONG_MIN;
    long curr=0;
    for(long i=0; i<queries.size();i++)
    {
        arr[queries[i][0]-1]+=queries[i][2];
        if(queries[i][1]<arr.size())
            arr[queries[i][1]]-=queries[i][2];
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=0)
        {
            curr+=arr[i];
            if(max<curr)
                max=curr;
        }
    }
    return max;
}