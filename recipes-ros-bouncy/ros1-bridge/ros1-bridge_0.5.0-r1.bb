# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple bridge between ROS 1 and ROS 2"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "actionlib-msgs ament-cmake ament-index-python builtin-interfaces diagnostic-msgs example-interfaces geometry-msgs nav-msgs pkgconfig python3-catkin-pkg-modules python3-yaml rclcpp rcutils rmw-implementation-cmake rosgraph-msgs rosidl-cmake rosidl-parser sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs tf2-msgs trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/ros2-gbp/ros1_bridge-release/archive/release/bouncy/ros1_bridge/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "153b57aec5510941cb550827c9f0415b"
SRC_URI[sha256sum] = "1a2ce0b441582ff32e7fa3b87e4cbb0f8c7a49ba215068a5909fbab26471d10f"
S = "${WORKDIR}/ros1_bridge-release-release-bouncy-ros1_bridge-0.5.0-1"

inherit catkin
