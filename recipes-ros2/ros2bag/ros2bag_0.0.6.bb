# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Entry point for rosbag in ROS 2"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli rosbag2-transport"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/${PN}/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c150243e7084369704e44b6ab4f4c69d"
SRC_URI[sha256sum] = "deaa02d1f5f7d095c3e1f7e190f8abe3d87c57559c35ca1a06011f3cf3f13082"
S = "${WORKDIR}/rosbag2-release-release-crystal-${PN}-0.0.6-0"

inherit catkin
