# Internet Advertising
Application Engineering and Development

Internet Advertising is a Java swing application.
The project simulates an auction based model to achieve real-time bidding in internet advertising
with the purpose of making web based advertising targeted and hence, effective. The advertisements 
on the webpages are fetched and displayed at the moment the user hits the page url. The displayed 
advertisement is choosen based on user's history over the web.

The object model consists of a hierarchy of System, Networks, Enterprises and Organizations. System
consists of multiple networks and the network consists of different enterprises inside it. The 
enterprises in turn have their own organizations for specific tasks.

Note: The object model diagrams are placed under 'Repository Issues'.

There are mainly three type of enterprises namely Advertisement Exchange(AdExchange), Advertiser
(Demand Side Platforms) and a Publisher (Supply Side Platforms). The publisher is the owner of 
the webpage. The advertiser is the one who wants to target their ads to users. The AdExchange is
a bridge between publisher and advertiser. The adexchange is responsible for tracking and maintaining
users history over web, directing incoming request of user's arrival  from the publisher to the
advertisers(bid request). Collecting the bids from the advertisers, finding the highest bid and
forwarding the selected advertisement to the publisher.

The project makes use of following design patterns in Java:
Singleton pattern,
Factory Pattern
