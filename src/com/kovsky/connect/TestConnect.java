package com.kovsky.connect;

import redis.clients.jedis.Jedis;

public class TestConnect{

	public static void main(String[] args) {
		//���ӱ��ص� Redis ����
        Jedis jedis = new Jedis("localhost");
        System.out.println("���ӳɹ�");
        //�鿴�����Ƿ�����
        System.out.println("������������: "+jedis.ping());
	}

}
