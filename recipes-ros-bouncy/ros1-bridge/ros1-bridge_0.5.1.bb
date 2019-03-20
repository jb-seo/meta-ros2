# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple bridge between ROS 1 and ROS 2"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "actionlib-msgs builtin-interfaces diagnostic-msgs example-interfaces geometry-msgs nav-msgs rclcpp rcutils rmw-implementation-cmake rosgraph-msgs rosidl-cmake rosidl-parser sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs tf2-msgs trajectory-msgs visualization-msgs pkgconfig python3-catkin-pkg-native python3-yaml"
SRC_URI = "https://github.com/ros2-gbp/ros1_bridge-release/archive/release/bouncy/ros1_bridge/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "533535bf72d793546b7e6b224b638d51"
SRC_URI[sha256sum] = "8475f6e0edd96ba2cd42bd0f2ecadece1c13a86dd2d3a9975483dd4f63fa9ff4"
S = "${WORKDIR}/ros1_bridge-release-release-bouncy-ros1_bridge-0.5.1-0"


inherit ros
inherit ament

