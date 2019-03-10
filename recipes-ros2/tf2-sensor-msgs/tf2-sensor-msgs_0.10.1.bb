# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Small lib to transform sensor_msgs with tf. Most notably, PointCloud2"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-auto eigen sensor-msgs tf2 tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/crystal/tf2_sensor_msgs/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ad0ef416355c30ecac19a79f79411ddd"
SRC_URI[sha256sum] = "9dd7df4d7dbc5eb6b757acf55b5d356d22903aefccabe59a1d770813c19c7cd7"
S = "${WORKDIR}/geometry2-release-release-crystal-tf2_sensor_msgs-0.10.1-0"

inherit catkin
