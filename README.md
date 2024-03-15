# Mendix Database Statement Statistics 0.1

## Description
This module leverages the PostgreSQL extension `pg_stat_statements` to collect statistics of queries used.
It creates snapshots (manually or scheduled) and stores the statistics in an entity so they can be queried from the frontend.

## Typical usage scenario
To explain database resource consumption.

# Features and limitations
`pg_stat_statements` contains a limited buffer, which is 5000 by default and can only be increased by server configuration during boot.
When hosting in the Mendix Cloud, this can't be altered.
Mendix is very chatty and there is a big chance that 5000 will not be enough to capture all queries.
During a lack of field experience, it is uncertain if this captures valuable information.

# Dependencies
Community Commons module.

# Installation and configuration
- Configure the constants `SnapshotInterval` and `SnapshotRetention`.
- Attach the `Administration` snippet to your navigation.
- Run the app and open `Administration` to configure the scheduled capturing of snapshots.

