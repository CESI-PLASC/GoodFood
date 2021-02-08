using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;

namespace auth.Migrations
{
    public partial class DeleteidAdresse : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_franchise_adresse_idAdresse",
                table: "franchise");

            migrationBuilder.DropTable(
                name: "adresse");

            migrationBuilder.DropIndex(
                name: "IX_franchise_idAdresse",
                table: "franchise");

            migrationBuilder.DropColumn(
                name: "idAdresse",
                table: "franchise");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<int>(
                name: "idAdresse",
                table: "franchise",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateTable(
                name: "adresse",
                columns: table => new
                {
                    id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("MySql:ValueGenerationStrategy", MySqlValueGenerationStrategy.IdentityColumn),
                    codePostal = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: false),
                    complement = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: true),
                    pays = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: false),
                    rue = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: false),
                    ville = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_adresse", x => x.id);
                });

            migrationBuilder.CreateIndex(
                name: "IX_franchise_idAdresse",
                table: "franchise",
                column: "idAdresse");

            migrationBuilder.AddForeignKey(
                name: "FK_franchise_adresse_idAdresse",
                table: "franchise",
                column: "idAdresse",
                principalTable: "adresse",
                principalColumn: "id",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
