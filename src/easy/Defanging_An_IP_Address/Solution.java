package easy.Defanging_An_IP_Address;

class Solution {
    public String defangIPaddr(String address) {
        String[] addrArray = address.split("\\.");
        return addrArray[0] + "[.]" + addrArray[1] + "[.]" + addrArray[2] + "[.]" + addrArray[3];
    }
}
