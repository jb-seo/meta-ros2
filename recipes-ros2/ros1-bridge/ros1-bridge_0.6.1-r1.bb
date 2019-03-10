# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple bridge between ROS 1 and ROS 2"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "actionlib-msgs ament-cmake ament-index-python builtin-interfaces diagnostic-msgs gazebo-msgs geometry-msgs nav-msgs pkgconfig python3-catkin-pkg-modules python3-yaml rclcpp rcutils rmw-implementation-cmake rosidl-cmake rosidl-parser sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs tf2-msgs trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/ros2-gbp/ros1_bridge-release/archive/release/crystal/ros1_bridge/0.6.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f79ecacfd3a426554cc0b1f6ed19dcba"
SRC_URI[sha256sum] = "69dade4330d7d62b0415f0a2a10987b7d3794c6f7c6e6c21c9766275a2e0901b"
S = "${WORKDIR}/ros1_bridge-release-release-crystal-ros1_bridge-0.6.1-1"

inherit catkin
