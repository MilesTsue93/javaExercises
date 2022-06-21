// from Alvin Azablan's Struct.ty tutorial on graphs

const edges = [
    ['a', 'b'],
    ['c,d'],
    ['e','f'],
    ['g','h'],
    ['i', 'j']
]



const undirectedPath = (edges, nodeA, nodeB) => {
    const graph = buildGraph(edges);
    console.log(hasPath(graph, nodeB, nodeA, new Set())); 
    return(hasPath(graph, nodeB, nodeA, new Set()));
};


// recursive function to see if a given src node 
// has a path to the dst node
const hasPath = (graph, src, dst, visited) => {
    if (src === dst) return true;
    if (visited.has(src)) return false;

    visited.add(src);

    for (let neighbor of graph[src]) {
        if (hasPath(graph, neighbor, dst, visited) === true) {
            return true;
        }
    }
        return false;
};


// Undirected Graph is currently in an edge list format.
// We want to convert that into an adjacency list
// with this helper function.
const buildGraph = (edges) => {
    const graph = {};

    for (let edge of edges) {
        if (!(a in graph)) graph[a] = [];
        if (!(b in graph)) graph[b] = [];
        graph[a].push(b);
        graph[b].push(a);
    }

    return graph;
}