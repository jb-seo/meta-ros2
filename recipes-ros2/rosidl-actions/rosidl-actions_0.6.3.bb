# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts action files into message and service files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-parser"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_actions/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "887fbaca1d56fc8e97b575c595d7b1a7"
SRC_URI[sha256sum] = "f79319429937ec9389ab706816c9e04dbbbb1903073b76317f97be19a61fd4b7"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_actions-0.6.3-0"

inherit catkin
