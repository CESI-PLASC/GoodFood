﻿// <auto-generated />
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;
using auth.data;

namespace auth.Migrations
{
    [DbContext(typeof(ApplicationDbContext))]
    [Migration("20210212094117_franchise update")]
    partial class franchiseupdate
    {
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("Relational:MaxIdentifierLength", 64)
                .HasAnnotation("ProductVersion", "5.0.2");

            modelBuilder.Entity("auth.entities.Franchise", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int")
                        .HasColumnName("id");

                    b.Property<string>("Designation")
                        .IsRequired()
                        .HasColumnType("longtext CHARACTER SET utf8mb4")
                        .HasColumnName("designation");

                    b.Property<bool>("EstSupprime")
                        .HasColumnType("tinyint(1)")
                        .HasColumnName("estSupprime");

                    b.Property<string>("Mail")
                        .HasColumnType("longtext CHARACTER SET utf8mb4")
                        .HasColumnName("mail");

                    b.Property<string>("Tel")
                        .HasColumnType("longtext CHARACTER SET utf8mb4")
                        .HasColumnName("tel");

                    b.HasKey("Id");

                    b.ToTable("franchise");
                });
#pragma warning restore 612, 618
        }
    }
}
