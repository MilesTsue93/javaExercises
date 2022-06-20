// graph traversal

const graph = {
    a: ['b', 'c'],
    b: ['d'],
    c: ['e'],
    d: [],
    e: [],
    f: ['d']
}

const hasPath = (graph, src, dst) => {
    if (src === dst) return true;
    
    for (let neighbor of graph[src]) {

        // recursive solution, taking advantage of stack frames
        if (hasPath(graph, neighbor, dst) === true) {  
            return true;
        }
    }

    // no path from src node to dst node
    return false;
}

console.log(hasPath(graph, 'a', 'd'));


