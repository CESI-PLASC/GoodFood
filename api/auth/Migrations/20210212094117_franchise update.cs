using Microsoft.EntityFrameworkCore.Migrations;

namespace auth.Migrations
{
    public partial class franchiseupdate : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<string>(
                name: "mail",
                table: "franchise",
                type: "longtext CHARACTER SET utf8mb4",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "tel",
                table: "franchise",
                type: "longtext CHARACTER SET utf8mb4",
                nullable: true);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "mail",
                table: "franchise");

            migrationBuilder.DropColumn(
                name: "tel",
                table: "franchise");
        }
    }
}
