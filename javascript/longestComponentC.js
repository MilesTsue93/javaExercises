// graph object
const graph = {
    0: [8, 1, 5],
    1: [0],
    2: [3,4],
    3: [2,4],
    4: [3,2],
    5: [0,8],
    8: [0,5]

};

// counting which component has most nodes
const largestComponentsCount = (graph) => {
    
    //initialize largest count and counter variables
    let largest = 0;
    
    const visited = new Set();  // initialize set of visited nodes

    for (let node in graph) {
        const count = explore(graph, node, visited);
        if (count > largest) largest = count;
    }
    return largest;
};
    

const explore = (graph, node, visited) => {

    // checking if node isn't visited already.
    // if so, count var will not be incremented
    if (visited.has(node)) return 0;

    // intititalize to 1 because it represents a starting node
    let count = 1;

    for (let neighbor of graph[current]) {

       // increment the count var every time a node is visited with this recursion 
       count += explore(graph, neighbor, visited);
    }

    return count;
}



console.log(largestComponentsCount(graph));