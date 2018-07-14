# Architectural Patterns
Some of the most common architectural patterns i've used so far.

### MVC + Service Layer
This pattern, also known as Layered pattern, divides an interactive application in to 4 parts as,

<ul>
    Model
    <li>domain data</li>
</ul>
<ul>
    View
    <li>displays the information to the user</li>
</ul>
<ul>
    Controller
    <li>handles the input from the user</li>
</ul> 
<ul>
    Service
    <li>domain logic</li>
</ul> 

You should use the <strong>service layer</strong> when:
 - you want to encapsulate domain logic under API
 - you need to implement multiple interfaces with common logic and data

#### TODO
- [x] MVC + Service Layer
- [ ] Pipe-filter
- [ ] Broker pattern
