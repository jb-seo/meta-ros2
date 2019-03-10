# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Commonly used test helper classes and fixtures for rosbag2"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rclcpp"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2_test_common/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "289d69fe5dbb918495bd577b93cd14c2"
SRC_URI[sha256sum] = "aa30cee2c69a8eb1e5c293a2abd2cca624cabbeed7930f2b6a68ea4f8162fa6d"
S = "${WORKDIR}/rosbag2-release-release-crystal-rosbag2_test_common-0.0.6-0"

inherit catkin
