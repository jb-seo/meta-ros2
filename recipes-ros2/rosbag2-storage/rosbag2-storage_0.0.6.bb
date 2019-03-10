# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS2 independent storage format to store serialized ROS2 messages"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake pluginlib rcutils yaml-cpp-vendor"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2_storage/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "078f582abd2886e9036d458583799cd3"
SRC_URI[sha256sum] = "31f5a778b53c18a638ecb7a7fd38e89250ca3dd794eb202fdbde55795ffae11a"
S = "${WORKDIR}/rosbag2-release-release-crystal-rosbag2_storage-0.0.6-0"

inherit catkin
