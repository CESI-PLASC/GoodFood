using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;

namespace auth.Migrations
{
    public partial class Initial : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "adresse",
                columns: table => new
                {
                    id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("MySql:ValueGenerationStrategy", MySqlValueGenerationStrategy.IdentityColumn),
                    pays = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: false),
                    codePostal = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: false),
                    rue = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: false),
                    ville = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: false),
                    complement = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_adresse", x => x.id);
                });

            migrationBuilder.CreateTable(
                name: "franchise",
                columns: table => new
                {
                    id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("MySql:ValueGenerationStrategy", MySqlValueGenerationStrategy.IdentityColumn),
                    designation = table.Column<string>(type: "longtext CHARACTER SET utf8mb4", nullable: false),
                    idAdresse = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_franchise", x => x.id);
                    table.ForeignKey(
                        name: "FK_franchise_adresse_idAdresse",
                        column: x => x.idAdresse,
                        principalTable: "adresse",
                        principalColumn: "id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_franchise_idAdresse",
                table: "franchise",
                column: "idAdresse");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "franchise");

            migrationBuilder.DropTable(
                name: "adresse");
        }
    }
}
