# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_geometry_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-auto geometry-msgs orocos-kdl tf2 tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/bouncy/tf2_geometry_msgs/0.9.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cdd2ce7dd3a0ab2b9bba5412a259f439"
SRC_URI[sha256sum] = "ee615a16b5f7f185b2f1aaddc5c2f8a010acd22ed43b77856a0b35d448fa0acb"
S = "${WORKDIR}/geometry2-release-release-bouncy-tf2_geometry_msgs-0.9.1-1"

inherit catkin
