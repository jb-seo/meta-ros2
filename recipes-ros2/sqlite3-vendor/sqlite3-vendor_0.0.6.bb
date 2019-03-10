# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "SQLite 3 vendor package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake libsqlite3-dev"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/sqlite3_vendor/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6390215f8bc02588bb1b268adc0bf91e"
SRC_URI[sha256sum] = "57e058ff6dece26f6fa45e0c22e4ac1b8cd8e6e0a9ef5844e81057381a7af2bb"
S = "${WORKDIR}/rosbag2-release-release-crystal-sqlite3_vendor-0.0.6-0"

inherit catkin
