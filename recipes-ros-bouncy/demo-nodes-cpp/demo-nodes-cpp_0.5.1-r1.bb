# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ nodes which were previously in the ros2/examples repository but are now just used for demo purposes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake example-interfaces launch-ros rclcpp rcutils rmw-implementation rmw-implementation-cmake rosidl-default-generators rosidl-default-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/demo_nodes_cpp/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d16c7e19f82334ace755d538972bbbb5"
SRC_URI[sha256sum] = "7116757463ab67d26ae55e324fa7705aaf4f898c0a1d9b7012c1301737832b12"
S = "${WORKDIR}/demos-release-release-bouncy-demo_nodes_cpp-0.5.1-1"

inherit catkin
