# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing storage and converter plugins for rosbag 1"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " pluginlib rclcpp rcutils ros1-bridge ros1-rosbag-storage-vendor rosbag2 rosbag2-storage"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2_bag_v2_plugins/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6cc02306a0f008600cb2aed4f443746d"
SRC_URI[sha256sum] = "df256bea86183963699f283fbc80ee89f0031fe3aca0870ac585778b62eb4842"
S = "${WORKDIR}/rosbag2-release-release-crystal-rosbag2_bag_v2_plugins-0.0.6-0"

inherit ament
