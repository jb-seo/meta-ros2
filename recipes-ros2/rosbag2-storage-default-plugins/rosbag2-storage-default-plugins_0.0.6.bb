# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROSBag2 SQLite3 storage plugin"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " pluginlib rcutils rosbag2-storage sqlite3-vendor"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2_storage_default_plugins/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4423feb24fb1d2544527bcbaba5b9604"
SRC_URI[sha256sum] = "79a2317a64f8989a7e55bf08f92969c8b836d7798326f18986c2090d3c71fe89"
S = "${WORKDIR}/rosbag2-release-release-crystal-rosbag2_storage_default_plugins-0.0.6-0"

inherit ament
