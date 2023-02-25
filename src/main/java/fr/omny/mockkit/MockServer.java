package fr.omny.mockkit;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.logging.Logger;

import org.bukkit.BanList;
import org.bukkit.BanList.Type;
import org.bukkit.GameMode;
import org.bukkit.Keyed;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.Registry;
import org.bukkit.Server;
import org.bukkit.StructureType;
import org.bukkit.Tag;
import org.bukkit.UnsafeValues;
import org.bukkit.Warning.WarningState;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.WorldCreator;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.data.BlockData;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.boss.KeyedBossBar;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.SpawnCategory;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.generator.ChunkGenerator.ChunkData;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.Recipe;
import org.bukkit.loot.LootTable;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.Criteria;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.structure.StructureManager;
import org.bukkit.util.CachedServerIcon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MockServer implements Server{

  @Override
  public void sendPluginMessage(Plugin source, String channel, byte[] message) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sendPluginMessage'");
  }

  @Override
  public Set<String> getListeningPluginChannels() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getListeningPluginChannels'");
  }

  @Override
  public String getName() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getName'");
  }

  @Override
  public String getVersion() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getVersion'");
  }

  @Override
  public String getBukkitVersion() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBukkitVersion'");
  }

  @Override
  public Collection<? extends Player> getOnlinePlayers() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOnlinePlayers'");
  }

  @Override
  public int getMaxPlayers() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMaxPlayers'");
  }

  @Override
  public int getPort() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPort'");
  }

  @Override
  public int getViewDistance() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getViewDistance'");
  }

  @Override
  public int getSimulationDistance() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSimulationDistance'");
  }

  @Override
  public String getIp() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getIp'");
  }

  @Override
  public String getWorldType() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWorldType'");
  }

  @Override
  public boolean getGenerateStructures() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getGenerateStructures'");
  }

  @Override
  public int getMaxWorldSize() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMaxWorldSize'");
  }

  @Override
  public boolean getAllowEnd() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAllowEnd'");
  }

  @Override
  public boolean getAllowNether() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAllowNether'");
  }

  @Override
  public String getResourcePack() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getResourcePack'");
  }

  @Override
  public String getResourcePackHash() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getResourcePackHash'");
  }

  @Override
  public String getResourcePackPrompt() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getResourcePackPrompt'");
  }

  @Override
  public boolean isResourcePackRequired() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isResourcePackRequired'");
  }

  @Override
  public boolean hasWhitelist() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'hasWhitelist'");
  }

  @Override
  public void setWhitelist(boolean value) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setWhitelist'");
  }

  @Override
  public boolean isWhitelistEnforced() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isWhitelistEnforced'");
  }

  @Override
  public void setWhitelistEnforced(boolean value) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setWhitelistEnforced'");
  }

  @Override
  public Set<OfflinePlayer> getWhitelistedPlayers() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWhitelistedPlayers'");
  }

  @Override
  public void reloadWhitelist() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reloadWhitelist'");
  }

  @Override
  public int broadcastMessage(String message) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'broadcastMessage'");
  }

  @Override
  public String getUpdateFolder() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUpdateFolder'");
  }

  @Override
  public File getUpdateFolderFile() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUpdateFolderFile'");
  }

  @Override
  public long getConnectionThrottle() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getConnectionThrottle'");
  }

  @Override
  public int getTicksPerAnimalSpawns() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTicksPerAnimalSpawns'");
  }

  @Override
  public int getTicksPerMonsterSpawns() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTicksPerMonsterSpawns'");
  }

  @Override
  public int getTicksPerWaterSpawns() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTicksPerWaterSpawns'");
  }

  @Override
  public int getTicksPerWaterAmbientSpawns() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTicksPerWaterAmbientSpawns'");
  }

  @Override
  public int getTicksPerWaterUndergroundCreatureSpawns() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTicksPerWaterUndergroundCreatureSpawns'");
  }

  @Override
  public int getTicksPerAmbientSpawns() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTicksPerAmbientSpawns'");
  }

  @Override
  public int getTicksPerSpawns(SpawnCategory spawnCategory) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTicksPerSpawns'");
  }

  @Override
  public Player getPlayer(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPlayer'");
  }

  @Override
  public Player getPlayerExact(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPlayerExact'");
  }

  @Override
  public List<Player> matchPlayer(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'matchPlayer'");
  }

  @Override
  public Player getPlayer(UUID id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPlayer'");
  }

  @Override
  public PluginManager getPluginManager() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPluginManager'");
  }

  @Override
  public BukkitScheduler getScheduler() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getScheduler'");
  }

  @Override
  public ServicesManager getServicesManager() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getServicesManager'");
  }

  @Override
  public List<World> getWorlds() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWorlds'");
  }

  @Override
  public World createWorld(WorldCreator creator) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createWorld'");
  }

  @Override
  public boolean unloadWorld(String name, boolean save) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'unloadWorld'");
  }

  @Override
  public boolean unloadWorld(World world, boolean save) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'unloadWorld'");
  }

  @Override
  public World getWorld(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWorld'");
  }

  @Override
  public World getWorld(UUID uid) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWorld'");
  }

  @Override
  public WorldBorder createWorldBorder() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createWorldBorder'");
  }

  @Override
  public MapView getMap(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMap'");
  }

  @Override
  public MapView createMap(World world) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createMap'");
  }

  @Override
  public ItemStack createExplorerMap(World world, Location location, StructureType structureType) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createExplorerMap'");
  }

  @Override
  public ItemStack createExplorerMap(World world, Location location, StructureType structureType, int radius,
      boolean findUnexplored) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createExplorerMap'");
  }

  @Override
  public void reload() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reload'");
  }

  @Override
  public void reloadData() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reloadData'");
  }

  @Override
  public Logger getLogger() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLogger'");
  }

  @Override
  public PluginCommand getPluginCommand(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPluginCommand'");
  }

  @Override
  public void savePlayers() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'savePlayers'");
  }

  @Override
  public boolean dispatchCommand(CommandSender sender, String commandLine) throws CommandException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'dispatchCommand'");
  }

  @Override
  public boolean addRecipe(Recipe recipe) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addRecipe'");
  }

  @Override
  public List<Recipe> getRecipesFor(ItemStack result) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecipesFor'");
  }

  @Override
  public Recipe getRecipe(NamespacedKey recipeKey) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecipe'");
  }

  @Override
  public Recipe getCraftingRecipe(ItemStack[] craftingMatrix, World world) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCraftingRecipe'");
  }

  @Override
  public ItemStack craftItem(ItemStack[] craftingMatrix, World world, Player player) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'craftItem'");
  }

  @Override
  public Iterator<Recipe> recipeIterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'recipeIterator'");
  }

  @Override
  public void clearRecipes() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clearRecipes'");
  }

  @Override
  public void resetRecipes() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'resetRecipes'");
  }

  @Override
  public boolean removeRecipe(NamespacedKey key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeRecipe'");
  }

  @Override
  public Map<String, String[]> getCommandAliases() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCommandAliases'");
  }

  @Override
  public int getSpawnRadius() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSpawnRadius'");
  }

  @Override
  public void setSpawnRadius(int value) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setSpawnRadius'");
  }

  @Override
  public boolean shouldSendChatPreviews() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'shouldSendChatPreviews'");
  }

  @Override
  public boolean isEnforcingSecureProfiles() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isEnforcingSecureProfiles'");
  }

  @Override
  public boolean getHideOnlinePlayers() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getHideOnlinePlayers'");
  }

  @Override
  public boolean getOnlineMode() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOnlineMode'");
  }

  @Override
  public boolean getAllowFlight() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAllowFlight'");
  }

  @Override
  public boolean isHardcore() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isHardcore'");
  }

  @Override
  public void shutdown() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'shutdown'");
  }

  @Override
  public int broadcast(String message, String permission) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'broadcast'");
  }

  @Override
  public OfflinePlayer getOfflinePlayer(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOfflinePlayer'");
  }

  @Override
  public OfflinePlayer getOfflinePlayer(UUID id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOfflinePlayer'");
  }

  @Override
  public PlayerProfile createPlayerProfile(UUID uniqueId, String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createPlayerProfile'");
  }

  @Override
  public PlayerProfile createPlayerProfile(UUID uniqueId) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createPlayerProfile'");
  }

  @Override
  public PlayerProfile createPlayerProfile(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createPlayerProfile'");
  }

  @Override
  public Set<String> getIPBans() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getIPBans'");
  }

  @Override
  public void banIP(String address) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'banIP'");
  }

  @Override
  public void unbanIP(String address) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'unbanIP'");
  }

  @Override
  public Set<OfflinePlayer> getBannedPlayers() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBannedPlayers'");
  }

  @Override
  public BanList getBanList(Type type) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBanList'");
  }

  @Override
  public Set<OfflinePlayer> getOperators() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOperators'");
  }

  @Override
  public GameMode getDefaultGameMode() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getDefaultGameMode'");
  }

  @Override
  public void setDefaultGameMode(GameMode mode) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setDefaultGameMode'");
  }

  @Override
  public ConsoleCommandSender getConsoleSender() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getConsoleSender'");
  }

  @Override
  public File getWorldContainer() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWorldContainer'");
  }

  @Override
  public OfflinePlayer[] getOfflinePlayers() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOfflinePlayers'");
  }

  @Override
  public Messenger getMessenger() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMessenger'");
  }

  @Override
  public HelpMap getHelpMap() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getHelpMap'");
  }

  @Override
  public Inventory createInventory(InventoryHolder owner, InventoryType type) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createInventory'");
  }

  @Override
  public Inventory createInventory(InventoryHolder owner, InventoryType type, String title) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createInventory'");
  }

  @Override
  public Inventory createInventory(InventoryHolder owner, int size) throws IllegalArgumentException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createInventory'");
  }

  @Override
  public Inventory createInventory(InventoryHolder owner, int size, String title) throws IllegalArgumentException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createInventory'");
  }

  @Override
  public Merchant createMerchant(String title) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createMerchant'");
  }

  @Override
  public int getMaxChainedNeighborUpdates() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMaxChainedNeighborUpdates'");
  }

  @Override
  public int getMonsterSpawnLimit() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMonsterSpawnLimit'");
  }

  @Override
  public int getAnimalSpawnLimit() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAnimalSpawnLimit'");
  }

  @Override
  public int getWaterAnimalSpawnLimit() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWaterAnimalSpawnLimit'");
  }

  @Override
  public int getWaterAmbientSpawnLimit() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWaterAmbientSpawnLimit'");
  }

  @Override
  public int getWaterUndergroundCreatureSpawnLimit() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWaterUndergroundCreatureSpawnLimit'");
  }

  @Override
  public int getAmbientSpawnLimit() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAmbientSpawnLimit'");
  }

  @Override
  public int getSpawnLimit(SpawnCategory spawnCategory) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSpawnLimit'");
  }

  @Override
  public boolean isPrimaryThread() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isPrimaryThread'");
  }

  @Override
  public String getMotd() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMotd'");
  }

  @Override
  public String getShutdownMessage() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getShutdownMessage'");
  }

  @Override
  public WarningState getWarningState() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getWarningState'");
  }

  @Override
  public ItemFactory getItemFactory() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getItemFactory'");
  }

  @Override
  public ScoreboardManager getScoreboardManager() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getScoreboardManager'");
  }

  @Override
  public Criteria getScoreboardCriteria(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getScoreboardCriteria'");
  }

  @Override
  public CachedServerIcon getServerIcon() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getServerIcon'");
  }

  @Override
  public CachedServerIcon loadServerIcon(File file) throws IllegalArgumentException, Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'loadServerIcon'");
  }

  @Override
  public CachedServerIcon loadServerIcon(BufferedImage image) throws IllegalArgumentException, Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'loadServerIcon'");
  }

  @Override
  public void setIdleTimeout(int threshold) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setIdleTimeout'");
  }

  @Override
  public int getIdleTimeout() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getIdleTimeout'");
  }

  @Override
  public ChunkData createChunkData(World world) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createChunkData'");
  }

  @Override
  public BossBar createBossBar(String title, BarColor color, BarStyle style, BarFlag... flags) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createBossBar'");
  }

  @Override
  public KeyedBossBar createBossBar(NamespacedKey key, String title, BarColor color, BarStyle style, BarFlag... flags) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createBossBar'");
  }

  @Override
  public Iterator<KeyedBossBar> getBossBars() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBossBars'");
  }

  @Override
  public KeyedBossBar getBossBar(NamespacedKey key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBossBar'");
  }

  @Override
  public boolean removeBossBar(NamespacedKey key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeBossBar'");
  }

  @Override
  public Entity getEntity(UUID uuid) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getEntity'");
  }

  @Override
  public Advancement getAdvancement(NamespacedKey key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAdvancement'");
  }

  @Override
  public Iterator<Advancement> advancementIterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'advancementIterator'");
  }

  @Override
  public BlockData createBlockData(Material material) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createBlockData'");
  }

  @Override
  public BlockData createBlockData(Material material, Consumer<BlockData> consumer) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createBlockData'");
  }

  @Override
  public BlockData createBlockData(String data) throws IllegalArgumentException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createBlockData'");
  }

  @Override
  public BlockData createBlockData(Material material, String data) throws IllegalArgumentException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createBlockData'");
  }

  @Override
  public <T extends Keyed> Tag<T> getTag(String registry, NamespacedKey tag, Class<T> clazz) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTag'");
  }

  @Override
  public <T extends Keyed> Iterable<Tag<T>> getTags(String registry, Class<T> clazz) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTags'");
  }

  @Override
  public LootTable getLootTable(NamespacedKey key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLootTable'");
  }

  @Override
  public List<Entity> selectEntities(CommandSender sender, String selector) throws IllegalArgumentException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'selectEntities'");
  }

  @Override
  public StructureManager getStructureManager() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getStructureManager'");
  }

  @Override
  public <T extends Keyed> Registry<T> getRegistry(Class<T> tClass) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRegistry'");
  }

  @Override
  public UnsafeValues getUnsafe() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUnsafe'");
  }

  @Override
  public Spigot spigot() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'spigot'");
  }
  
}
