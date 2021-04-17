package interview_question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IP4_numberOfDevices {
    public static void main(String[] args) {
        String [][]connections ={{"192.167.0.0","192.167.0.1"},{"192.167.0.2","192.167.0.0"},{"192.167.0.0","192.167.0.3"}};
        String []toggleIps= {"192.167.0.1","192.167.0.0","192.167.0.2","192.167.0.0", "0.0.0.0"};
        int[] result = numberOfDevices(connections, toggleIps);

        for(int i:result) {
            System.out.print(i + " ");
        }
    }

    public static int[] numberOfDevices(String[][] connections, String[] toggleIps) {
        int count =0;
        int [] result = new int[toggleIps.length];
        if(connections.length>0) { // already a given contaraint that the length of toggle IPs is >=1

            Map<String,Ipv4Address> ip = new HashMap<>();
            for(int i=0; i<connections.length; i++) {
                Ipv4Address ip1, ip2;

                if(!ip.containsKey(connections[i][0])) {
                    ip.put(connections[i][0], new Ipv4Address(connections[i][0]));
                }
                if(!ip.containsKey(connections[i][1])) {
                    ip.put(connections[i][1], new Ipv4Address(connections[i][1]));
                }

                ip1=ip.get(connections[i][0]);
                ip2=ip.get(connections[i][1]);

                ip1.addConnection(ip2);
                ip2.addConnection(ip1);

            }

            for(int j=0; j<toggleIps.length; j++) {
                if(!ip.containsKey(toggleIps[j])) {
                    result[j]=0;
                }
                else {
                    Ipv4Address ipv4 = ip.get(toggleIps[j]);
                    ipv4.setState(!(ipv4.getState()));
                    for(Ipv4Address conn:ipv4.getConnections()) {
                        if(conn.getState()) {
                            result[j]++;
                        }
                    }
                }
            }
        }

        return result;
    }

}

// class representing the IPv4 address , it has IP address, current state and the connections where its present
class Ipv4Address{
    String ipAddress;
    boolean state;
    List<Ipv4Address> connections;


    public Ipv4Address(String ipAddress) {
        this.ipAddress = ipAddress;
        this.state=false;
        connections= new ArrayList<>();
    }

    public boolean getState() {
        return this.state;
    }
    public void setState(boolean state) {
        this.state=state;
    }

    public void addConnection(Ipv4Address ipaddress) {
        this.connections.add(ipaddress);
    }
    public List<Ipv4Address> getConnections(){
        return this.connections;
    }

}
