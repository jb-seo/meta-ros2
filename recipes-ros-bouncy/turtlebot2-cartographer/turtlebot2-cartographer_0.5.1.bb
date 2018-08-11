# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files for turtlebot2 cartographer demo"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-index-python astra-camera cartographer-ros depthimage-to-laserscan depthimage-to-pointcloud2 joy launch ros2run teleop-twist-joy tf2-ros turtlebot2-drivers"
SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/turtlebot2_cartographer/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "19c0d380031b736e35d87852600de887"
SRC_URI[sha256sum] = "f48855ec700be98741d509da4830b6d92d0ddc552a57cdec26e7b013c88c1d55"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-turtlebot2_cartographer-0.5.1-0"

inherit catkin
