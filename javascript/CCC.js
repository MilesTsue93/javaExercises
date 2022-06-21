// Connected Components count === CCC

const graph = {
    0: [8, 1, 5],
    1: [0],
    2: [3,4],
    3: [2,4],
    4: [3,2],
    5: [0,8],
    8: [0,5]

};


const connectedComponentsCount = (graph) => {

    // will increment this variable with each node visited
    let count = 0;
    //create a Set variable 
    const visited = new Set();
    
    // traverse through each node
    for (let node in graph) {
        if (explore(graph, node, visited) === true) {
            count += 1;
        }
    }

    return count;
}

const explore = (graph, current, visited) => {
    
    // to prevent infinite cycles to same nodes
    if (visited.has(String(current))) return false;  // casting int to String to bypass javascript object oddity

    visited.add(String(current));  // same here

    for (let neighbor of graph[current]) {
        explore(graph, neighbor, visited);
    }

    return true;

}

const result = connectedComponentsCount(graph);

console.log(result);

