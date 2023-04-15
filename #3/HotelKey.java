public static Map<Long, Long> map = new ConcurrentHashMap<>();

public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        for(int i=0; i<room_number.length; i++) {
            answer[i] = findRoom(room_number[i]);
        }
        return answer;
}

public long findRoom(long room) {
        if(!map.containsKey(room)) {// 해당 방이 없으면
            map.put(room, room+1);  // 다음 방을 넣어준다.
            return room;            // 현재 방을 리턴
        }
        long findRoom = findRoom(map.get(room));
        map.put(room, findRoom);
        return findRoom;
}

public static void main(String[] args) {
        HotelRecursive hotelRecursive = new HotelRecursive();
        long k = 10;
        long[] room_number = {1,3,4,1,3,1};
        hotelRecursive.solution(k, room_number);
}