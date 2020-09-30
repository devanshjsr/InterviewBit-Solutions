stack<int> s;
// stack<int> aux;
int mn;
MinStack::MinStack() {
    stack<int> empt;
    s = empt;
    mn = -1;
    // aux = empt;
}

void MinStack::push(int x) {
    if(s.empty()){
        s.push(x);
        mn = x;
    }else if(x>=mn){
        s.push(x);
    }else{
        s.push(2*x - mn);
        mn = x;
    }
    // if(aux.empty() || x<=aux.top())
        // aux.push(x);
}

void MinStack::pop() {
    if(s.empty())   return;
    if(s.top()>mn){
        s.pop();
    }else{
        int x = s.top();
        s.pop();
        mn = 2*mn-x;
    }
    // int x = s.top();
    // s.pop();
    // if(!aux.empty() && aux.top() == x)
        // aux.pop();
}

int MinStack::top() {
    if(s.empty())   return -1;
    return s.top();
}

int MinStack::getMin() {
    // if(aux.empty()) return -1;
    // return aux.top();
    return mn;
}

void MinStack::pop() {
if(!s.empty())
{
if(s.top()>m)
{
s.pop();
if(s.empty())
m=-1;
}
else
{
m = 2*m-s.top();
s.pop();
if(s.empty())
m=-1;
}
}
}

int MinStack::top() {
if(s.empty())
{
return -1;
}
else
{
if(s.top()>m)
return s.top();
else
return m;
}
}

int MinStack::getMin() {
return m;
}
