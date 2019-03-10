# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages for NCS inference"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a530e7e8bd0b9c8e6d4e5d32904af192"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/ros2_object_msgs-release/archive/release/crystal/object_msgs/0.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "580f215036b296e715d18c447faaf45f"
SRC_URI[sha256sum] = "0ff91ee611ff83f2c486675907db807660ca39f61db519a77b59543d627735c2"
S = "${WORKDIR}/ros2_object_msgs-release-release-crystal-object_msgs-0.3.0-1"

inherit catkin
