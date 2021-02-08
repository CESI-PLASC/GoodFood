using Microsoft.EntityFrameworkCore.Migrations;

namespace auth.Migrations
{
    public partial class Franchiséajoutdelasuppresionvirtuelle : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<bool>(
                name: "estSupprime",
                table: "franchise",
                type: "tinyint(1)",
                nullable: false,
                defaultValue: false);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "estSupprime",
                table: "franchise");
        }
    }
}
