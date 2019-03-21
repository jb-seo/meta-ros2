# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for the cartographer_ros package."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

DEPENDS = "geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/cartographer_ros-release/archive/release/bouncy/cartographer_ros_msgs/2.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "da0d21b6a8483d8f8cf116ea4fe23df3"
SRC_URI[sha256sum] = "fc6cc26c4762d4c1eb2ec984740839845dd06d885a1be3452c253f02c65174b7"
S = "${WORKDIR}/cartographer_ros-release-release-bouncy-cartographer_ros_msgs-2.1.1-1"

inherit ros
inherit ament


