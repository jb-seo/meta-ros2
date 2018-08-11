# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some geometry related message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/geometry_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "393eef116be6f1a379abb3a822f5ce7d"
SRC_URI[sha256sum] = "ccf3572d8a99b78a161b8703de5ad3bbeba67bb67e905bdaf32f2c9e2220a5c8"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-geometry_msgs-0.5.0-1"

inherit catkin
