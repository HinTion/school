package org.example.school.entity;

import lombok.*;

import java.io.*;

/**
 * 作者: Hinton
 * 创建时间: 2024-09-17 下午9:10
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Externalizable {

    private int id;
    private String name;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(id);
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id =  in.readInt();
        name = (String) in.readObject();
    }
}
