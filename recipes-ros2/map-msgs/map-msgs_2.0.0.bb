# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages commonly used in mapping packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "ament-cmake nav-msgs rosidl-default-generators rosidl-default-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/navigation_msgs-release/archive/release/crystal/map_msgs/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d45258c3d3d5737f5995c81b46b5068"
SRC_URI[sha256sum] = "43f77c54d0949407d8727434c917b81860edf52867e84985f088b7d69a116e4f"
S = "${WORKDIR}/navigation_msgs-release-release-crystal-map_msgs-2.0.0-0"

inherit catkin
