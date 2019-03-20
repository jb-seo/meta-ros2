# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by     sensor_msgs/LaserScan into a point cloud as defined by sensor_msgs/PointCloud     or sensor_msgs/PointCloud2. In particular, it contains functionality to account     for the skew resulting from moving robots or tilting laser scanners."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rclcpp sensor-msgs tf2 eigen"
SRC_URI = "https://github.com/ros2-gbp/laser_geometry-release/archive/release/bouncy/laser_geometry/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "83b93cfe150b0fa259a4e45678ea5cca"
SRC_URI[sha256sum] = "c049c41b52ce6be24ba955f6e545d644201ec707e2c5953bcb3284b9802bfda8"
S = "${WORKDIR}/laser_geometry-release-release-bouncy-laser_geometry-2.0.0-0"


inherit ros
inherit ament

