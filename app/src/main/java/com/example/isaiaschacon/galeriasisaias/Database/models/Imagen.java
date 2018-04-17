package com.example.isaiaschacon.galeriasisaias.Database.models;


import com.example.isaiaschacon.galeriasisaias.Database.GaleriaDB;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = GaleriaDB.class)

public class Imagen extends BaseModel {

    @Column
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String uri;

    @Column
    public String nombre;

    @Column
    public String autor;
}
