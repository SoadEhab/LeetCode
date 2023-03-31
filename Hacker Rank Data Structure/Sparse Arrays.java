vector<int> matchingStrings(vector<string> stringList, vector<string> queries) {
    vector<int>count(queries.size());
    for(int i=0;i<queries.size();i++)
    {
        for(int j=0; j<stringList.size();j++)
        {
            if(stringList[j].compare(queries[i])==0)
            {
                count[i]++;
            }
        }
    }
    return count;
}